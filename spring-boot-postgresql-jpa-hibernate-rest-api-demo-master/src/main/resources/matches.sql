INSERT INTO matches (matchid, date, goaleaway, goalehome, awayteamid, hometeamid)
VALUES(1,'2015-10-10', 1, 0, 1 ,2),
(2,'2015-10-11', 1, 0, 1 ,3),
(3,'2015-10-14', 1, 0, 2 ,1)
;


SELECT * FROM teams
JOIN matches ON (teams.teamid = matches.hometeamid)


