package com.ssrs.mapper;

import com.ssrs.model.DictionaryType;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * <p>
 * 字典类型表 Mapper 接口
 * </p>
 *
 * @author ssrs
 * @since 2018-10-24
 */
@CacheNamespace(implementation = com.ssrs.core.cache.RedisMybatisCache.class )
public interface DictionaryTypeMapper extends BaseMapper<DictionaryType> {

}
