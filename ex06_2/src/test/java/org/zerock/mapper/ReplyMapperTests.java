package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class ReplyMapperTests {
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;

	private Long[] bnoArr = { 54L, 52L, 50L, 48L, 46L, 42L, 40L, 38L, 34L, 33L };

//	@Test
//	public void testCreate() {
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//
//			ReplyVO vo = new ReplyVO();
//
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트" + i);
//			vo.setReplyer("replyer" + i);
//
//			mapper.insert(vo);
//		});
//	}
//
//	@Test
//	public void testRead() {
//
//		Long targetRno = 5L;
//
//		ReplyVO vo = mapper.read(targetRno);
//
//		log.info(vo);
//	}
//
//	@Test
//	public void testMapper() {
//		log.info(mapper);
//	}
//	
//	@Test
//	public void testDelete() {
//		Long targetRno=1L;
//		
//		mapper.delete(targetRno);
//	}
//
//	@Test
//	public void testUpdate() {
//
//		Long targetRNo = 5L;
//
//		ReplyVO vo = mapper.read(targetRNo);
//
//		vo.setReply("Update Reply ");
//
//		int count = mapper.update(vo);
//
//		log.info("UPDATE COUNT:" + count);
//	}
//	
//	@Test
//	public void testList() {
//		Criteria cri = new Criteria();
//		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
//		
//		replies.forEach(reply -> log.info(reply));
//	}

	@Test
	public void testList2() {
		Criteria cri = new Criteria(2, 10);

		List<ReplyVO> replies = mapper.getListWithPaging(cri, 54L);

		replies.forEach(reply -> log.info(reply));
	}
}
