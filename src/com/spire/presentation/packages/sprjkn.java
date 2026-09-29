/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Native
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfu;
import com.spire.presentation.packages.sprinn;
import com.spire.presentation.packages.sprnsp;
import com.spire.presentation.packages.sprtea;
import com.sun.jna.Native;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

@sprtea
public class sprjkn {
    private static String cfr_renamed_3 = null;
    private static boolean cfr_renamed_4;

    public static sprfu cfr_renamed_12981() {
        return sprjkn.cfr_renamed_12982();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_12983(int arg0, String arg1, String arg2) {
        int n;
        String string;
        arg1 = arg1.toLowerCase();
        switch (arg0) {
            case 0: {
                if ("i386".equals(arg1)) {
                    arg1 = "x86";
                } else if ("amd64".equals(arg1)) {
                    arg1 = "x64";
                }
                string = new StringBuilder().insert(0, "win-").append(arg1).toString();
                return new StringBuilder().insert(0, "/com/spire/doc/harfbuzzsharp/").append(string).toString();
            }
            case 1: {
                if ("x86".equals(arg1)) {
                    arg1 = "i386";
                } else if ("x86_64".equals(arg1) || "amd64".equals(arg1)) {
                    arg1 = "x64";
                }
                string = new StringBuilder().insert(0, "linux-").append(arg1).toString();
                return new StringBuilder().insert(0, "/com/spire/doc/harfbuzzsharp/").append(string).toString();
            }
            case 2: 
            case 4: {
                string = "osx";
                return new StringBuilder().insert(0, "/com/spire/doc/harfbuzzsharp/").append(string).toString();
            }
            case 3: {
                string = new StringBuilder().insert(0, "sunos-").append(arg1).toString();
                return new StringBuilder().insert(0, "/com/spire/doc/harfbuzzsharp/").append(string).toString();
            }
        }
        string = arg2.toLowerCase();
        if ("x86".equals(arg1)) {
            arg1 = "i386";
        }
        if ("x86_64".equals(arg1)) {
            arg1 = "amd64";
        }
        if ("powerpc".equals(arg1)) {
            arg1 = "ppc";
        }
        if ((n = string.indexOf(" ")) != -1) {
            string = string.substring(0, n);
        }
        string = new StringBuilder().insert(0, string).append("-").append(arg1).toString();
        return new StringBuilder().insert(0, "/com/spire/doc/harfbuzzsharp/").append(string).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ boolean cfr_renamed_12984() {
        String string = cfr_renamed_3;
        if (string != null && cfr_renamed_4) {
            File file = new File(string);
            if (file.delete()) {
                cfr_renamed_3 = null;
                cfr_renamed_4 = false;
                return true;
            }
            try {
                Method method;
                Object e;
                String string2;
                Field field;
                ClassLoader classLoader = Native.class.getClassLoader();
                Field field2 = field = ClassLoader.class.getDeclaredField("nativeLibraries");
                field2.setAccessible(true);
                Iterator iterator = ((List)field2.get(classLoader)).iterator();
                do {
                    if (!iterator.hasNext()) {
                        return false;
                    }
                    e = iterator.next();
                    Field field3 = field = e.getClass().getDeclaredField("name");
                    field3.setAccessible(true);
                    string2 = (String)field3.get(e);
                    if (string2.equals(string) || string2.indexOf(string) != -1) break;
                } while (!string2.equals(file.getCanonicalPath()));
                Method method2 = method = e.getClass().getDeclaredMethod("finalize", new Class[0]);
                method2.setAccessible(true);
                method2.invoke(e, new Object[0]);
                cfr_renamed_3 = null;
                if (cfr_renamed_4 && file.exists()) {
                    if (file.delete()) {
                        cfr_renamed_4 = false;
                        return true;
                    }
                    return false;
                }
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprfu cfr_renamed_12982() {
        String string = System.mapLibraryName("HarfBuzzSharp");
        String string2 = System.getProperty("os.arch");
        String string3 = System.getProperty("os.name");
        String string4 = new StringBuilder().insert(0, sprjkn.cfr_renamed_12983(sprnsp.cfr_renamed_12985(), string2, string3)).append("/").append(string).toString();
        URL uRL = Native.class.getResource(string4);
        if (uRL == null && (sprnsp.cfr_renamed_12985() == 2 || sprnsp.cfr_renamed_12985() == 4) && string4.endsWith(".dylib")) {
            uRL = Native.class.getResource(string4);
        }
        if (uRL == null) {
            throw new UnsatisfiedLinkError(new StringBuilder().insert(0, "libHarfBuzzSharp (").append(string4).append(") not found in resource path").toString());
        }
        File file = null;
        if (uRL.getProtocol().toLowerCase().equals("file")) {
            File file2;
            try {
                file2 = file = new File(new URI(uRL.toString()));
            }
            catch (URISyntaxException uRISyntaxException) {
                file2 = file = new File(uRL.getPath());
            }
            if (!file2.exists()) {
                throw new Error(new StringBuilder().insert(0, "File URL ").append(uRL).append(" could not be properly decoded").toString());
            }
        } else {
            FileOutputStream fileOutputStream;
            InputStream inputStream = Native.class.getResourceAsStream(string4);
            if (inputStream == null) {
                throw new Error("Can't obtain libHarfBuzzSharp InputStream");
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                int n;
                file = File.createTempFile("libHarfBuzzSharp", sprnsp.cfr_renamed_12986() ? ".dll" : null);
                file.deleteOnExit();
                ClassLoader classLoader = Native.class.getClassLoader();
                if (classLoader == null || classLoader.equals(ClassLoader.getSystemClassLoader())) {
                    Runtime.getRuntime().addShutdownHook(new sprinn(file));
                }
                fileOutputStream2 = new FileOutputStream(file);
                byte[] byArray = new byte[1024];
                while ((n = inputStream.read(byArray, 0, byArray.length)) > 0) {
                    fileOutputStream2.write(byArray, 0, n);
                }
            }
            catch (IOException iOException) {
                try {
                    throw new Error(new StringBuilder().insert(0, "Failed to create temporary file for libHarfBuzzSharp library: ").append(iOException).toString());
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    FileOutputStream fileOutputStream3;
                    try {
                        inputStream.close();
                        fileOutputStream3 = fileOutputStream2;
                    }
                    catch (IOException iOException2) {
                        fileOutputStream3 = fileOutputStream2;
                    }
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream2.close();
                            throwable2 = throwable;
                            throw throwable2;
                        }
                        catch (IOException iOException3) {
                            // empty catch block
                        }
                    }
                    throwable2 = throwable;
                    throw throwable2;
                }
            }
            try {
                inputStream.close();
                fileOutputStream = fileOutputStream2;
            }
            catch (IOException iOException) {
                fileOutputStream = fileOutputStream2;
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream2.close();
                }
                catch (IOException iOException) {}
            }
            cfr_renamed_4 = true;
        }
        File file3 = file;
        System.load(file3.getAbsolutePath());
        cfr_renamed_3 = file3.getAbsolutePath();
        return (sprfu)Native.loadLibrary((String)cfr_renamed_3, sprfu.class);
    }

    public static /* synthetic */ boolean cfr_renamed_2413() {
        return sprjkn.cfr_renamed_12984();
    }
}

