package com.dazzle.escort.facility.model;

import java.io.Serializable;
import java.util.*;

/**
 * @author trgoofi
 */
public class Page<T> implements Iterable<T>, Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int page = 1;
    private int size = 10;
    private long total;
    private Collection<T> contents = Collections.emptyList();
    private Map<String, Object> params = new HashMap<String, Object>();


    public int getOffset() {
        return (page - 1) * size;
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) total / (double) size);
    }

    @Override
    public Iterator<T> iterator() {
        return contents.iterator();
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page < 1) {
            page = 1;
        }
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 1) {
            size = 10;     // fallback to default size.
        }
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Collection<T> getContents() {
        return contents;
    }

    public void setContents(Collection<T> contents) {
        this.contents = contents;
    }

    public Page<T> param(String key, Object value) {
        params.put(key, value);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
