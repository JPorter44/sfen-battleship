// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package client.panels;

import javax.swing.*;

/************************************************************/
/**
 * 
 */
//builds the gui for the leaderboard panel and should be displayed from the PlayingControl class
public class ViewLeaderBoardPanel extends JPanel
{
	/**
	 * 
	 */
	private String[] usernames;
	private int matchesWon;
	private int timeElapsed;

	public int getTime()
	{
		return timeElapsed;
	}

	public int getMatchesWon()
	{
		return matchesWon;
	}

	public String[] getUsernames()
	{
		return usernames;
	}
}
