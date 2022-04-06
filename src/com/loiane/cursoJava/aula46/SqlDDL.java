package com.loiane.cursoJava.aula46;

public interface SqlDDL {

	void create(String query);
	void alter(String query);
	void drop(String query);
}
