package project.momento.imgup.dto;
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class ImgupDto {
	
	/*사진*/
	private MultipartFile imgFile;
	
}