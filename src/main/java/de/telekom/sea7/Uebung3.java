package de.telekom.sea7;

public class Uebung3 {

}


/* das muss in die POM Datei:
 wenn Dependencies verwendet werden:
 
<dependencies>
	<dependency>
		<groupId>...</groupId>
		<artifactId>...</artifactId>
		<version>...</version>
	</dependency>
</dependencies>
 
 hier wird die JavaDatei eingefügt mit der gestartet werden soll 
 mit GroupID, die ArtifactID und die Version:


<plugins>
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-jar-plugin</artifactId>
		<version>3.2.0</version>
		
hier muss noch der Pfad der Class eingefügt werden
		<configuration>
			<archive>
				<manifest>
					<mainClass>de.telekom.sea7.Feierabend2</mainClass>
				</manifest>
			</archive>
		</configuration>
	</plugin>
</plugins>
</build>  
*/