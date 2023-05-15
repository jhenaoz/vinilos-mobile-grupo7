package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new co.misw4203.grupo7.vinilos.DataBinderMapperImpl());
  }
}
