package spring.example.transaction.command;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import spring.example.transaction.dao.TicketDao;
import spring.example.transaction.dto.TicketDto;

public class TicketCommand implements iTicketCommand {

	private TicketDao ticketDao;
	private TransactionTemplate transactionTemplate2;

	public TicketDao getTicketDao() {
		return ticketDao;
	}

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	public TransactionTemplate getTransactionTemplate2() {
		return transactionTemplate2;
	}

	public void setTransactionTemplate2(TransactionTemplate transactionTemplate2) {
		this.transactionTemplate2 = transactionTemplate2;
	}

	@Override
	public void execute(final TicketDto ticketDto) {
		// TODO Auto-generated method stub
		
		transactionTemplate2.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				// TODO Auto-generated method stub
				
				ticketDto.setAmount("1");
				ticketDao.buyTicket(ticketDto);
				
				ticketDto.setAmount("5");
				ticketDao.buyTicket(ticketDto);
			}
		});
	}

}
