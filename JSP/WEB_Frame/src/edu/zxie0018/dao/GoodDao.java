package edu.zxie0018.dao;

import java.util.List;

import edu.zxie0018.model.Good;
import edu.zxie0018.util.DatabaseUtil;

public class GoodDao {
	public List<Good> getAllGoods() {
		return DatabaseUtil.goodsList;
	}
}
