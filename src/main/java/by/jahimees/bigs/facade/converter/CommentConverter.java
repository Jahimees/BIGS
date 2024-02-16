package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Comment;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.CommentDto;

public class CommentConverter implements Converter<Comment, CommentDto> {

    @Override
    public CommentDto convertToDto(Comment entity) {
        return null;
    }

    @Override
    public Comment convertToEntity(CommentDto dto) {
        return null;
    }
}
