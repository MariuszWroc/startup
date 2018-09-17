package com.atos.startup.logic;

import java.util.Collection;

public interface Generator<T> {

	public Collection<T> generate();
}
