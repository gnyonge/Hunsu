package com.project.hunsu.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHashtag is a Querydsl query type for Hashtag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHashtag extends EntityPathBase<Hashtag> {

    private static final long serialVersionUID = 588594158L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHashtag hashtag = new QHashtag("hashtag");

    public final StringPath content = createString("content");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final QOotd ootd;

    public final BooleanPath type = createBoolean("type");

    public QHashtag(String variable) {
        this(Hashtag.class, forVariable(variable), INITS);
    }

    public QHashtag(Path<? extends Hashtag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHashtag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHashtag(PathMetadata metadata, PathInits inits) {
        this(Hashtag.class, metadata, inits);
    }

    public QHashtag(Class<? extends Hashtag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ootd = inits.isInitialized("ootd") ? new QOotd(forProperty("ootd"), inits.get("ootd")) : null;
    }

}

