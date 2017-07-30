package spring.example.transaction.command;

import spring.example.transaction.dto.TicketDto;

public interface iTicketCommand {

	public void execute(TicketDto ticketDto);
	
}
