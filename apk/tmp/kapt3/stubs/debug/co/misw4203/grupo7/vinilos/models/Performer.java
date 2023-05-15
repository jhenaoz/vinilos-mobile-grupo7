package co.misw4203.grupo7.vinilos.models;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lco/misw4203/grupo7/vinilos/models/Performer;", "", "albums", "", "Lco/misw4203/grupo7/vinilos/models/Album;", "getAlbums", "()Ljava/util/List;", "description", "", "getDescription", "()Ljava/lang/String;", "id", "", "getId", "()I", "image", "getImage", "name", "getName", "app_debug"})
public abstract interface Performer {
    
    public abstract int getId();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getImage();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getDescription();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<co.misw4203.grupo7.vinilos.models.Album> getAlbums();
}