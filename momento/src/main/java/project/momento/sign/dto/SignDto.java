package project.momento.sign.dto;
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */

import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class SignDto {
	
	
	private String PK_USER_SEQ;
	/*아이디*/
	private String USER_ID;
	/*비밀번호*/
	private String USER_PASSWORD;
	/*비밀번호 확인*/
	private String USER_NM;
	/*성별*/
	private String USER_SEX;
	/*생년월일*/
	private String USER_BIRTH;
	/*주소*/
	private String USER_ADDR;
	/*상세 주소*/
	private String USER_ADDR_DETAIL;

	private String REGIST_DT;
}