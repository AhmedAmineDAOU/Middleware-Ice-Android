// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.1
//
// <auto-generated>
//
// Generated from file `Printer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public interface PrinterPrx extends com.zeroc.Ice.ObjectPrx
{
    default String printString(String s)
    {
        return printString(s, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String printString(String s, java.util.Map<String, String> context)
    {
        return _iceI_printStringAsync(s, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> printStringAsync(String s)
    {
        return _iceI_printStringAsync(s, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> printStringAsync(String s, java.util.Map<String, String> context)
    {
        return _iceI_printStringAsync(s, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.String> _iceI_printStringAsync(String iceP_s, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.String> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printString", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_s);
                 }, istr -> {
                     String ret;
                     ret = istr.readString();
                     return ret;
                 });
        return f;
    }

    default music[] findByName(String songName)
    {
        return findByName(songName, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default music[] findByName(String songName, java.util.Map<String, String> context)
    {
        return _iceI_findByNameAsync(songName, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<music[]> findByNameAsync(String songName)
    {
        return _iceI_findByNameAsync(songName, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<music[]> findByNameAsync(String songName, java.util.Map<String, String> context)
    {
        return _iceI_findByNameAsync(songName, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<music[]> _iceI_findByNameAsync(String iceP_songName, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<music[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "findByName", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_songName);
                 }, istr -> {
                     music[] ret;
                     ret = listmusicHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default music[] findAllMusics()
    {
        return findAllMusics(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default music[] findAllMusics(java.util.Map<String, String> context)
    {
        return _iceI_findAllMusicsAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<music[]> findAllMusicsAsync()
    {
        return _iceI_findAllMusicsAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<music[]> findAllMusicsAsync(java.util.Map<String, String> context)
    {
        return _iceI_findAllMusicsAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<music[]> _iceI_findAllMusicsAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<music[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "findAllMusics", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     music[] ret;
                     ret = listmusicHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default music[] findByAuth(String authorName)
    {
        return findByAuth(authorName, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default music[] findByAuth(String authorName, java.util.Map<String, String> context)
    {
        return _iceI_findByAuthAsync(authorName, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<music[]> findByAuthAsync(String authorName)
    {
        return _iceI_findByAuthAsync(authorName, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<music[]> findByAuthAsync(String authorName, java.util.Map<String, String> context)
    {
        return _iceI_findByAuthAsync(authorName, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<music[]> _iceI_findByAuthAsync(String iceP_authorName, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<music[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "findByAuth", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_authorName);
                 }, istr -> {
                     music[] ret;
                     ret = listmusicHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default music[] findByAlbum(String albumName)
    {
        return findByAlbum(albumName, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default music[] findByAlbum(String albumName, java.util.Map<String, String> context)
    {
        return _iceI_findByAlbumAsync(albumName, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<music[]> findByAlbumAsync(String albumName)
    {
        return _iceI_findByAlbumAsync(albumName, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<music[]> findByAlbumAsync(String albumName, java.util.Map<String, String> context)
    {
        return _iceI_findByAlbumAsync(albumName, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<music[]> _iceI_findByAlbumAsync(String iceP_albumName, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<music[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "findByAlbum", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_albumName);
                 }, istr -> {
                     music[] ret;
                     ret = listmusicHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default music[] findByGenre(String genre)
    {
        return findByGenre(genre, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default music[] findByGenre(String genre, java.util.Map<String, String> context)
    {
        return _iceI_findByGenreAsync(genre, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<music[]> findByGenreAsync(String genre)
    {
        return _iceI_findByGenreAsync(genre, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<music[]> findByGenreAsync(String genre, java.util.Map<String, String> context)
    {
        return _iceI_findByGenreAsync(genre, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<music[]> _iceI_findByGenreAsync(String iceP_genre, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<music[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "findByGenre", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_genre);
                 }, istr -> {
                     music[] ret;
                     ret = listmusicHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default music getMusicByName(String name)
    {
        return getMusicByName(name, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default music getMusicByName(String name, java.util.Map<String, String> context)
    {
        return _iceI_getMusicByNameAsync(name, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<music> getMusicByNameAsync(String name)
    {
        return _iceI_getMusicByNameAsync(name, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<music> getMusicByNameAsync(String name, java.util.Map<String, String> context)
    {
        return _iceI_getMusicByNameAsync(name, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<music> _iceI_getMusicByNameAsync(String iceP_name, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<music> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getMusicByName", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_name);
                 }, istr -> {
                     music ret;
                     ret = music.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default byte[] getCoverByMusic(String path)
    {
        return getCoverByMusic(path, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default byte[] getCoverByMusic(String path, java.util.Map<String, String> context)
    {
        return _iceI_getCoverByMusicAsync(path, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<byte[]> getCoverByMusicAsync(String path)
    {
        return _iceI_getCoverByMusicAsync(path, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<byte[]> getCoverByMusicAsync(String path, java.util.Map<String, String> context)
    {
        return _iceI_getCoverByMusicAsync(path, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<byte[]> _iceI_getCoverByMusicAsync(String iceP_path, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<byte[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getCoverByMusic", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_path);
                 }, istr -> {
                     byte[] ret;
                     ret = istr.readByteSeq();
                     return ret;
                 });
        return f;
    }

    default void addToFavorites(String songname)
    {
        addToFavorites(songname, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void addToFavorites(String songname, java.util.Map<String, String> context)
    {
        _iceI_addToFavoritesAsync(songname, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> addToFavoritesAsync(String songname)
    {
        return _iceI_addToFavoritesAsync(songname, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> addToFavoritesAsync(String songname, java.util.Map<String, String> context)
    {
        return _iceI_addToFavoritesAsync(songname, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_addToFavoritesAsync(String iceP_songname, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "addToFavorites", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_songname);
                 }, null);
        return f;
    }

    default void removeFromFavorites(String songname)
    {
        removeFromFavorites(songname, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void removeFromFavorites(String songname, java.util.Map<String, String> context)
    {
        _iceI_removeFromFavoritesAsync(songname, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> removeFromFavoritesAsync(String songname)
    {
        return _iceI_removeFromFavoritesAsync(songname, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> removeFromFavoritesAsync(String songname, java.util.Map<String, String> context)
    {
        return _iceI_removeFromFavoritesAsync(songname, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_removeFromFavoritesAsync(String iceP_songname, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "removeFromFavorites", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_songname);
                 }, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, PrinterPrx.class, _PrinterPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default PrinterPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (PrinterPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default PrinterPrx ice_adapterId(String newAdapterId)
    {
        return (PrinterPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default PrinterPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (PrinterPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default PrinterPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (PrinterPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default PrinterPrx ice_invocationTimeout(int newTimeout)
    {
        return (PrinterPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default PrinterPrx ice_connectionCached(boolean newCache)
    {
        return (PrinterPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default PrinterPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (PrinterPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PrinterPrx ice_secure(boolean b)
    {
        return (PrinterPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default PrinterPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (PrinterPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PrinterPrx ice_preferSecure(boolean b)
    {
        return (PrinterPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default PrinterPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (PrinterPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default PrinterPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (PrinterPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default PrinterPrx ice_collocationOptimized(boolean b)
    {
        return (PrinterPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default PrinterPrx ice_twoway()
    {
        return (PrinterPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default PrinterPrx ice_oneway()
    {
        return (PrinterPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default PrinterPrx ice_batchOneway()
    {
        return (PrinterPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default PrinterPrx ice_datagram()
    {
        return (PrinterPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default PrinterPrx ice_batchDatagram()
    {
        return (PrinterPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default PrinterPrx ice_compress(boolean co)
    {
        return (PrinterPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default PrinterPrx ice_timeout(int t)
    {
        return (PrinterPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default PrinterPrx ice_connectionId(String connectionId)
    {
        return (PrinterPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
   
    static String ice_staticId()
    {
        return "::Demo::Printer";
    }
}
