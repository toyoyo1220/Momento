package project.momento.chart.mapper;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import project.momento.chart.dto.ChartDto;
import project.momento.imgup.dto.ImgupDto;


@Mapper
public interface ChartMapper {

	void userpage(ChartDto chartDto);

}