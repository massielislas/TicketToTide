package Model;

import Results.GameResult;
import Results.GameStartResult;
import Results.LoginRegisterResult;
import Results.Result;

/**
 * Created by Topper on 5/14/2018.
 */

public interface ITicketToRide {
    LoginRegisterResult registerUser(String username, String password, String host, String port);
    LoginRegisterResult loginUser(String username, String password, String host, String port);
    Result addPlayerToGame(String userName, Integer playerCount, Integer currentPlayers, Integer gameNumber, String ID);
    GameResult createNewGame(Integer playerCount, Integer currentPlayers, Integer gameNumber, String ID);
    GameStartResult startGame(Integer playerCount, Integer currentPlayers, Integer gameNumber, String ID);

}

