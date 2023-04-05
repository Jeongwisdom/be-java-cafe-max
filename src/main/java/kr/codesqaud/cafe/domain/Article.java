package kr.codesqaud.cafe.domain;

public class Article {
    private Long index;
    private String title;
    private String writer;
    private String contents;
    private String writeDate;
    private long hits = 0L;

    public Article(Long index, String title, String writer, String contents, String writeDate) {
        this.index = index;
        this.title = title;
        this.writer = writer;
        this.contents = contents;
        this.writeDate = writeDate;
    }

    public Long getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getContents() {
        return contents;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
    }
}
