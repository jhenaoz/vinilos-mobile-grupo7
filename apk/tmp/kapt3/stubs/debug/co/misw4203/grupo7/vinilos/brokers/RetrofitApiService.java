package co.misw4203.grupo7.vinilos.brokers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H\'\u00a8\u0006\t"}, d2 = {"Lco/misw4203/grupo7/vinilos/brokers/RetrofitApiService;", "", "getProperties", "Lretrofit2/Call;", "", "postProperties", "name", "telephone", "email", "app_debug"})
public abstract interface RetrofitApiService {
    
    @retrofit2.http.GET(value = "collectors")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<java.lang.String> getProperties();
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "collectors")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<java.lang.String> postProperties(@retrofit2.http.Field(value = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @retrofit2.http.Field(value = "telephone")
    @org.jetbrains.annotations.NotNull
    java.lang.String telephone, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email);
}