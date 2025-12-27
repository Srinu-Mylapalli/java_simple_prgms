package com.apress.bgn.ch5;
import com.apress.bgn.ch4.hierarchy.*;
public class ReferencesDemo2{
	public static void main(String... args){
		Performer performer=new Performer("John",40,1.91f,Gender,MALE);
	Human human=performer;
	Actor actor=performer;
	Musician musician=performer;
	//these will not compile!!!
	performer = musician;
	//or
	performer = human;
	//or
	performer = actor;
	}
}
