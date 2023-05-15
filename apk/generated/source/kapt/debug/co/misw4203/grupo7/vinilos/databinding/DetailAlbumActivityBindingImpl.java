package co.misw4203.grupo7.vinilos.databinding;
import co.misw4203.grupo7.vinilos.R;
import co.misw4203.grupo7.vinilos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailAlbumActivityBindingImpl extends DetailAlbumActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.genreAlbumLabel, 6);
        sViewsWithIds.put(R.id.recordLabelAlbumLabel, 7);
        sViewsWithIds.put(R.id.descriptionAlbumLabel, 8);
        sViewsWithIds.put(R.id.tracksRv, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailAlbumActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private DetailAlbumActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            );
        this.descriptionAlbum.setTag(null);
        this.genreAlbum.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.recordLabelAlbum.setTag(null);
        this.titleAlbum.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.album == variableId) {
            setAlbum((co.misw4203.grupo7.vinilos.models.Album) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlbum(@Nullable co.misw4203.grupo7.vinilos.models.Album Album) {
        this.mAlbum = Album;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.album);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String albumName = null;
        co.misw4203.grupo7.vinilos.models.Album album = mAlbum;
        java.lang.String albumCover = null;
        java.lang.String albumRecordLabel = null;
        java.lang.String albumDescription = null;
        java.lang.String albumGenre = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (album != null) {
                    // read album.name
                    albumName = album.getName();
                    // read album.cover
                    albumCover = album.getCover();
                    // read album.recordLabel
                    albumRecordLabel = album.getRecordLabel();
                    // read album.description
                    albumDescription = album.getDescription();
                    // read album.genre
                    albumGenre = album.getGenre();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionAlbum, albumDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.genreAlbum, albumGenre);
            co.misw4203.grupo7.vinilos.BindingAdaptersKt.bindImage(this.imageView, albumCover);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recordLabelAlbum, albumRecordLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleAlbum, albumName);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.imageView.setContentDescription(albumName);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): album
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}