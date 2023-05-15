package co.misw4203.grupo7.vinilos.network;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\nJ\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lco/misw4203/grupo7/vinilos/network/CacheManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "albums", "Landroid/util/LruCache;", "", "Lco/misw4203/grupo7/vinilos/models/Album;", "bands", "Lco/misw4203/grupo7/vinilos/models/Band;", "musicians", "Lco/misw4203/grupo7/vinilos/models/Musician;", "addAlbum", "", "id", "album", "addBand", "band", "addMusician", "musician", "getAlbum", "getBand", "getMusician", "Companion", "app_debug"})
public final class CacheManager {
    @org.jetbrains.annotations.Nullable
    private static co.misw4203.grupo7.vinilos.network.CacheManager instance;
    @org.jetbrains.annotations.NotNull
    private android.util.LruCache<java.lang.Integer, co.misw4203.grupo7.vinilos.models.Band> bands;
    @org.jetbrains.annotations.NotNull
    private android.util.LruCache<java.lang.Integer, co.misw4203.grupo7.vinilos.models.Musician> musicians;
    @org.jetbrains.annotations.NotNull
    private android.util.LruCache<java.lang.Integer, co.misw4203.grupo7.vinilos.models.Album> albums;
    @org.jetbrains.annotations.NotNull
    public static final co.misw4203.grupo7.vinilos.network.CacheManager.Companion Companion = null;
    
    public CacheManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void addBand(int id, @org.jetbrains.annotations.NotNull
    co.misw4203.grupo7.vinilos.models.Band band) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final co.misw4203.grupo7.vinilos.models.Band getBand(int id) {
        return null;
    }
    
    public final void addMusician(int id, @org.jetbrains.annotations.NotNull
    co.misw4203.grupo7.vinilos.models.Musician musician) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final co.misw4203.grupo7.vinilos.models.Musician getMusician(int id) {
        return null;
    }
    
    public final void addAlbum(int id, @org.jetbrains.annotations.NotNull
    co.misw4203.grupo7.vinilos.models.Album album) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final co.misw4203.grupo7.vinilos.models.Album getAlbum(int id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lco/misw4203/grupo7/vinilos/network/CacheManager$Companion;", "", "()V", "instance", "Lco/misw4203/grupo7/vinilos/network/CacheManager;", "getInstance", "()Lco/misw4203/grupo7/vinilos/network/CacheManager;", "setInstance", "(Lco/misw4203/grupo7/vinilos/network/CacheManager;)V", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final co.misw4203.grupo7.vinilos.network.CacheManager getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable
        co.misw4203.grupo7.vinilos.network.CacheManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final co.misw4203.grupo7.vinilos.network.CacheManager getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}