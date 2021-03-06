/*
 * Copyright 2007-2107 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.persistence.jdbc.operator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * <p>
 * IResultSetHandler
 * </p>
 * <p>
 * 结果集数据处理接口，用于完成对记录集原始数据的简单包装及存储处理结果集合等相关信息；
 * </p>
 * 
 * @author 刘镇(suninformation@163.com)
 * @version 0.0.0
 *          <table style="border:1px solid gray;">
 *          <tr>
 *          <th width="100px">版本号</th><th width="100px">动作</th><th
 *          width="100px">修改人</th><th width="100px">修改时间</th>
 *          </tr>
 *          <!-- 以 Table 方式书写修改历史 -->
 *          <tr>
 *          <td>0.0.0</td>
 *          <td>创建类</td>
 *          <td>刘镇</td>
 *          <td>2010-6-2 下午02:16:09</td>
 *          </tr>
 *          </table>
 */
public interface IResultSetHandler<T> {

	/**
	 * 执行结果集处理动作
	 * 
	 * @param rs 预处理的结果集对象
	 * @param maxRow 最大记录行数，在于 0 的值才生效
	 * @throws OperatorException
	 * @throws SQLException
	 */
	public void handle(ResultSet rs, int maxRow) throws OperatorException, SQLException;
	
	/**
	 * @return 获取记录集行数
	 */
	public int getRowCount();
	
	/**
	 * @return 获取每行字段数
	 */
	public int getColumnCount();
	
	/**
	 * @return 获取字段名称集合
	 */
	public String[] getColumnNames();
	
	/**
	 * @return 获取字段类型集合
	 */
	public int[] getColumnTypes();
	
	/**
	 * @return 获取处理后的最终数据结果集合
	 */
	public List<T> getResultDataSet();
	
}
