package edu.zxie0018.service;

import java.util.List;

import edu.zxie0018.dao.GoodDao;
import edu.zxie0018.model.Good;

public class GoodsService {
	public List<Good> selectAllGoods() {
		return new GoodDao().getAllGoods();
	}
}
