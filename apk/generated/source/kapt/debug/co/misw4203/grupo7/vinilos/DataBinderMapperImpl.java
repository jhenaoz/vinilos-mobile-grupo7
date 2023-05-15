package co.misw4203.grupo7.vinilos;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import co.misw4203.grupo7.vinilos.databinding.AlbumItemBindingImpl;
import co.misw4203.grupo7.vinilos.databinding.CollectorItemBindingImpl;
import co.misw4203.grupo7.vinilos.databinding.DetailAlbumActivityBindingImpl;
import co.misw4203.grupo7.vinilos.databinding.DetailPerformerActivityBindingImpl;
import co.misw4203.grupo7.vinilos.databinding.FragmentAlbumsBindingImpl;
import co.misw4203.grupo7.vinilos.databinding.FragmentCollectorsBindingImpl;
import co.misw4203.grupo7.vinilos.databinding.PerformerItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ALBUMITEM = 1;

  private static final int LAYOUT_COLLECTORITEM = 2;

  private static final int LAYOUT_DETAILALBUMACTIVITY = 3;

  private static final int LAYOUT_DETAILPERFORMERACTIVITY = 4;

  private static final int LAYOUT_FRAGMENTALBUMS = 5;

  private static final int LAYOUT_FRAGMENTCOLLECTORS = 6;

  private static final int LAYOUT_PERFORMERITEM = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.album_item, LAYOUT_ALBUMITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.collector_item, LAYOUT_COLLECTORITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.detail_album_activity, LAYOUT_DETAILALBUMACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.detail_performer_activity, LAYOUT_DETAILPERFORMERACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.fragment_albums, LAYOUT_FRAGMENTALBUMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.fragment_collectors, LAYOUT_FRAGMENTCOLLECTORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(co.misw4203.grupo7.vinilos.R.layout.performer_item, LAYOUT_PERFORMERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ALBUMITEM: {
          if ("layout/album_item_0".equals(tag)) {
            return new AlbumItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for album_item is invalid. Received: " + tag);
        }
        case  LAYOUT_COLLECTORITEM: {
          if ("layout/collector_item_0".equals(tag)) {
            return new CollectorItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for collector_item is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILALBUMACTIVITY: {
          if ("layout/detail_album_activity_0".equals(tag)) {
            return new DetailAlbumActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_album_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILPERFORMERACTIVITY: {
          if ("layout/detail_performer_activity_0".equals(tag)) {
            return new DetailPerformerActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_performer_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALBUMS: {
          if ("layout/fragment_albums_0".equals(tag)) {
            return new FragmentAlbumsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_albums is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOLLECTORS: {
          if ("layout/fragment_collectors_0".equals(tag)) {
            return new FragmentCollectorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_collectors is invalid. Received: " + tag);
        }
        case  LAYOUT_PERFORMERITEM: {
          if ("layout/performer_item_0".equals(tag)) {
            return new PerformerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for performer_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "album");
      sKeys.put(2, "collector");
      sKeys.put(3, "performer");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/album_item_0", co.misw4203.grupo7.vinilos.R.layout.album_item);
      sKeys.put("layout/collector_item_0", co.misw4203.grupo7.vinilos.R.layout.collector_item);
      sKeys.put("layout/detail_album_activity_0", co.misw4203.grupo7.vinilos.R.layout.detail_album_activity);
      sKeys.put("layout/detail_performer_activity_0", co.misw4203.grupo7.vinilos.R.layout.detail_performer_activity);
      sKeys.put("layout/fragment_albums_0", co.misw4203.grupo7.vinilos.R.layout.fragment_albums);
      sKeys.put("layout/fragment_collectors_0", co.misw4203.grupo7.vinilos.R.layout.fragment_collectors);
      sKeys.put("layout/performer_item_0", co.misw4203.grupo7.vinilos.R.layout.performer_item);
    }
  }
}
