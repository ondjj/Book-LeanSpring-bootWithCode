package org.zerock.gestbook.entity;

import java.awt.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Apple {
    private Color color;
    private Long weight;
}
