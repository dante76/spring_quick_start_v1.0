/*
 * Github 연결테스트 3
 */
package com.springbook.biz.board;

import java.sql.SQLException;
import java.util.List;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient{
	public static void main(String[] args) throws SQLException{
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("Mybatis 제목");
		vo.setWriter("김준혁");
		vo.setContent("mybatis 내용입니다....");
		//boardDAO.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for(BoardVO board : boardList){
			System.out.println("---> " + board.toString());
		}
	}
}