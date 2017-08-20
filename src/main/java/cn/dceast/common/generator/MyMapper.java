package cn.dceast.common.generator;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * （一句话描述）
 * 作用：
 *
 * @author 王功文
 * @date 2017/5/10 15:58
 * @see
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
