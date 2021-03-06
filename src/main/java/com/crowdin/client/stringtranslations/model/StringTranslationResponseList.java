package com.crowdin.client.stringtranslations.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class StringTranslationResponseList {

    private List<StringTranslationResponseObject> data;
    private Pagination pagination;

    public static ResponseList<StringTranslation> to(StringTranslationResponseList stringTranslationResponseList) {
        return ResponseList.of(
                stringTranslationResponseList.getData().stream()
                        .map(StringTranslationResponseObject::getData)
                        .map(ResponseObject::of)
                        .collect(Collectors.toList()),
                stringTranslationResponseList.getPagination()
        );
    }
}
