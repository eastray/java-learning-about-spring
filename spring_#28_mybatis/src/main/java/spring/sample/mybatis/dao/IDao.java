package spring.sample.mybatis.dao;

import java.util.ArrayList;

import spring.sample.mybatis.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao();
	public void writeDao(String mWriter, String mContent);
	public ContentDto viewDao(String strID);
	public void deleteDao(String bId);
	
	
}
