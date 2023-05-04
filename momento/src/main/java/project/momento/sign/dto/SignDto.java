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
	
	/*아이디*/
	private String id;
	/*비밀번호*/
	private String pwd;
	/*비밀번호 확인*/
	private String pwdRe;
	/*성별*/
	private String userName;
	/*생년월일*/
	private String birthday;
	/*주소*/
	private String address;
	/*상세 주소*/
	private String addressMain;

}