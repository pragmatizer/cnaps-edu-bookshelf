package com.sk.cnaps.edu.bookshelf.domain.model;

import java.util.HashSet;
import java.util.Set;

import com.sk.cnaps.domain.model.ValueObject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Contents extends ValueObject {
	private Set<String> chapters = new HashSet<>();
}
