package model;

import java.util.List;

public interface MessageBoardDAO {
	List<MessageBoardEntity> selectUsername(String username);
	void speech(MessageBoardEntity message);
	void delSpeech(String username,String time);
	List<MessageBoardEntity> sequenceSpeech(int n);
}
