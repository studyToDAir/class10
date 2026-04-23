package kr.or.human3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode
@Data
public class MemberDTO {

	String id;
	String pw;
	String name;
	String tel;
	String email;
	int age;

}
