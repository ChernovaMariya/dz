class Message{

	Message(){
		System.out.println("Message");
	}

	UserAccount userAccount = new UserAccount();
	CensureMessageValidator censureMessageValidator = new CensureMessageValidator();
	LengthMessageValidator lengthMessageValidator = new LengthMessageValidator();

}