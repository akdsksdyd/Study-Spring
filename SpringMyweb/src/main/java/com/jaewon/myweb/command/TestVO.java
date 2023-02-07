package com.jaewon.myweb.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString //toString
@Data //getter, setter, toString
@NoArgsConstructor //�⺻������
@AllArgsConstructor //��� ������� ������
public class TestVO {
	
	private String name;
	private int age;
	private String addr;

}
