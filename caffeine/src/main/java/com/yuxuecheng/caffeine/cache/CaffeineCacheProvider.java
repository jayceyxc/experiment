package com.yuxuecheng.caffeine.cache;

import com.github.benmanes.caffeine.cache.*;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.concurrent.TimeUnit;

/**
 * @author: yuxuecheng
 * @title: CaffeineCacheProvider
 * @projectName: experiment
 * @description: 参考链接：https://mp.weixin.qq.com/s/Sa5vxws9LOSq-LZl-e3lRA
 * @date 2020/12/15 16:45
 */
@Slf4j
public class CaffeineCacheProvider {
    private static LoadingCache<String, String> cache = Caffeine.newBuilder()
            // 最大个数限制
            .maximumSize(256)
            // 初始化容量
            .initialCapacity(1)
            // 访问后过期（包括读和写）
            .expireAfterAccess(2, TimeUnit.DAYS)
            // 写后过期
            .expireAfterWrite(2, TimeUnit.HOURS)
            // 写后自动异步刷新
            .refreshAfterWrite(1, TimeUnit.HOURS)
            // 记录下缓存的一些统计数据，例如命中率等
            .recordStats()
            //cache对缓存写的通知回调
            .writer(new CacheWriter<Object, Object>() {
                @Override
                public void write(@NonNull Object key, @NonNull Object value) {
                    log.info("key={}, CacheWriter write", key);
                }

                @Override
                public void delete(@NonNull Object key, @Nullable Object value, @NonNull RemovalCause cause) {
                    log.info("key={}, cause={}, CacheWriter delete", key, cause);
                }
            })
            //使用CacheLoader创建一个LoadingCache
            .build(new CacheLoader<String, String>() {

                // 同步加载数据
                @Nullable
                @Override
                public  String load(@NonNull String key) throws Exception {
                    String result = "value_" + key;
                    log.info("load return: {}", result);
                    return result;
                }

                // 异步加载数据
                @Nullable
                @Override
                public String reload(@NonNull String key, @NonNull String oldValue) throws Exception {
                    String result = "value_" + key;
                    log.info("reload return: {}", result);
                    return result;
                }
            });

    public static void main(String[] args) {
        cache.put("hello", "test");
        String value = cache.get("hello");
        log.info("key: {}, value: {}", "hello", value);
        log.info(cache.stats().toString());
        value = cache.get("will");
        log.info("key: {}, value: {}", "will", value);
        log.info(cache.stats().toString());
    }
}
