package cn.dao.storage;

import cn.pojo.Storage;

/**
 * @ClassName:     StorageMapper.java
 * @Description:   TODO(入库表) 
 * 
 * @author         刘宇航
 * @version        V1.0  
 * @Date           2017年12月15日 下午3:20:40  
*/
public interface StorageMapper {
	
	/**
	 * 
	 * @Title:        addStorage 
	 * @Description:  TODO(入库添加) 
	 * @param:        @param storage    
	 * @return:       void    
	 * @throws 
	 * @author        刘宇航
	 * @Date          2017年12月15日 下午3:21:30
	 */
	public void addStorage(Storage storage);
}
