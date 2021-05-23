package wooteco.subway.line.dto;

import wooteco.subway.line.domain.Section;

public class SectionResponse {
    private Long id;
    private Long upStationId;
    private Long downStationId;
    private int distance;

    public SectionResponse() {
    }

    public SectionResponse(Long id, Long upStationId, Long downStationId, int distance) {
        this.id = id;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public static SectionResponse of(Section section) {
        return new SectionResponse(
                section.getId(),
                section.getUpStationId(),
                section.getDownStationId(),
                section.getDistance());

    }

    public Long getId() {
        return id;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
