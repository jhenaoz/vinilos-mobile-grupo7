package co.misw4203.grupo7.vinilos.ui.albums;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lco/misw4203/grupo7/vinilos/ui/albums/AlbumsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lco/misw4203/grupo7/vinilos/ui/albums/AlbumsAdapter$AlbumsViewHolder;", "()V", "value", "", "Lco/misw4203/grupo7/vinilos/models/Album;", "albums", "getAlbums", "()Ljava/util/List;", "setAlbums", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AlbumsViewHolder", "app_debug"})
public final class AlbumsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<co.misw4203.grupo7.vinilos.ui.albums.AlbumsAdapter.AlbumsViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<co.misw4203.grupo7.vinilos.models.Album> albums;
    
    public AlbumsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<co.misw4203.grupo7.vinilos.models.Album> getAlbums() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setAlbums(@org.jetbrains.annotations.NotNull
    java.util.List<co.misw4203.grupo7.vinilos.models.Album> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public co.misw4203.grupo7.vinilos.ui.albums.AlbumsAdapter.AlbumsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    co.misw4203.grupo7.vinilos.ui.albums.AlbumsAdapter.AlbumsViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lco/misw4203/grupo7/vinilos/ui/albums/AlbumsAdapter$AlbumsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewDataBinding", "Lco/misw4203/grupo7/vinilos/databinding/AlbumItemBinding;", "(Lco/misw4203/grupo7/vinilos/databinding/AlbumItemBinding;)V", "getViewDataBinding", "()Lco/misw4203/grupo7/vinilos/databinding/AlbumItemBinding;", "Companion", "app_debug"})
    public static final class AlbumsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final co.misw4203.grupo7.vinilos.databinding.AlbumItemBinding viewDataBinding = null;
        @androidx.annotation.LayoutRes
        private static final int LAYOUT = co.misw4203.grupo7.vinilos.R.layout.album_item;
        @org.jetbrains.annotations.NotNull
        public static final co.misw4203.grupo7.vinilos.ui.albums.AlbumsAdapter.AlbumsViewHolder.Companion Companion = null;
        
        public AlbumsViewHolder(@org.jetbrains.annotations.NotNull
        co.misw4203.grupo7.vinilos.databinding.AlbumItemBinding viewDataBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final co.misw4203.grupo7.vinilos.databinding.AlbumItemBinding getViewDataBinding() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lco/misw4203/grupo7/vinilos/ui/albums/AlbumsAdapter$AlbumsViewHolder$Companion;", "", "()V", "LAYOUT", "", "getLAYOUT", "()I", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            public final int getLAYOUT() {
                return 0;
            }
        }
    }
}