/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjy;
import com.spire.presentation.packages.sprbpl;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprfpk;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.spritl;
import com.spire.presentation.packages.sprix;
import com.spire.presentation.packages.sprjkg;
import com.spire.presentation.packages.sprkfk;
import com.spire.presentation.packages.sprkt;
import com.spire.presentation.packages.sprlch;
import com.spire.presentation.packages.sprltm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmnk;
import com.spire.presentation.packages.sprmqg;
import com.spire.presentation.packages.sprnlk;
import com.spire.presentation.packages.sprox;
import com.spire.presentation.packages.sprpjk;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtue;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvfk;
import com.spire.presentation.packages.sprvnk;
import com.spire.presentation.packages.sprxgk;
import com.spire.presentation.packages.spryfk;
import com.spire.presentation.packages.sprzgk;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class sprpmk {
    private static final Pattern cfr_renamed_86;
    private final String cfr_renamed_152;
    public static final String cfr_renamed_112 = "/serverkeygen";
    public static final String cfr_renamed_119 = "/simplereenroll";
    public static final Set<String> cfr_renamed_91;
    public static final String cfr_renamed_0 = "/fullcmc";
    private final sprox cfr_renamed_1;
    public static final String cfr_renamed_2 = "/cacerts";
    public static final String cfr_renamed_3 = "/csrattrs";
    public static final String cfr_renamed_4 = "/simpleenroll";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxgk cfr_renamed_9764(sprfpk arg0) throws IOException {
        sprfpk sprfpk2 = arg0;
        sprvnk sprvnk2 = sprfpk2.cfr_renamed_9734();
        sprug<sprtpl> sprug2 = null;
        if (sprfpk2.cfr_renamed_9732() == 202) {
            String string = arg0.cfr_renamed_9733(sprdfj.cfr_renamed_9("\u0001\u007f'h*7\u0012|'\u007f!"));
            if (string == null) {
                throw new sprkfk(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("}\"Nmi9[9O>\u001a\u007f\n\u007f\u001a/O9\u001a#U9\u001a\u001f_9H4\u0017\f\\9_?\u001a%_,^(Hm\\?U \u0000m")).append(sprvnk2.cfr_renamed_2627().toString()).toString());
            }
            long l = -1L;
            try {
                l = System.currentTimeMillis() + Long.parseLong(string) * 1000L;
                return new sprxgk(null, l, sprvnk2, arg0.cfr_renamed_9765());
            }
            catch (NumberFormatException numberFormatException) {
                try {
                    SimpleDateFormat simpleDateFormat;
                    SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprdfj.cfr_renamed_9("\u0016_\u00166s~7:\u001eW\u001e:*c*csR\u001b >wii :)"), Locale.US);
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(sprbjy.cfr_renamed_9("\nw\u0019")));
                    l = simpleDateFormat2.parse(string).getTime();
                    return new sprxgk(null, l, sprvnk2, arg0.cfr_renamed_9765());
                }
                catch (Exception exception) {
                    throw new sprkfk(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("\u0006t2x?\u007fsn<:#{!i6:\u0001\u007f'h*7\u0012|'\u007f!:;\u007f2~6hi")).append(sprvnk2.cfr_renamed_2627().toString()).append(" ").append(exception.getMessage()).toString(), null, arg0.cfr_renamed_9732(), arg0.cfr_renamed_2920());
                }
            }
        }
        if (arg0.cfr_renamed_9732() == 200 && arg0.cfr_renamed_9766(sprbjy.cfr_renamed_9("Y\"T9_#N`N4J(")).contains(sprdfj.cfr_renamed_9(">o?n:j2h'5>s+\u007f7"))) {
            sprfhh sprfhh2 = new sprfhh(arg0.cfr_renamed_9766(sprbjy.cfr_renamed_9("Y\"T9_#N`N4J(")), "base64");
            sprlch sprlch2 = new sprlch(sprfhh2, arg0.cfr_renamed_2920());
            Object[] objectArray = new Object[2];
            sprlch2.cfr_renamed_8519(new sprzgk(this, objectArray));
            if (objectArray[0] == null) throw new sprkfk(sprdfj.cfr_renamed_9("h6y6s%\u007f7:=\u007f:n;\u007f!:#h:l2n6:8\u007f*::t5us{=~sy6h's5s0{'\u007f "));
            if (objectArray[1] == null) {
                throw new sprkfk(sprdfj.cfr_renamed_9("h6y6s%\u007f7:=\u007f:n;\u007f!:#h:l2n6:8\u007f*::t5us{=~sy6h's5s0{'\u007f "));
            }
            sprug2 = ((sprbpl)objectArray[1]).cfr_renamed_617();
            return new sprxgk(sprug2, -1L, null, arg0.cfr_renamed_9765(), sprcom.cfr_renamed_23(objectArray[0]));
        }
        if (arg0.cfr_renamed_9732() != 200) throw new sprkfk(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("\u001eS J!_m\u007f#H\"V!\u0000m")).append(sprvnk2.cfr_renamed_2627().toString()).toString(), null, arg0.cfr_renamed_9732(), arg0.cfr_renamed_2920());
        sprrzm sprrzm2 = new sprrzm(arg0.cfr_renamed_2920());
        sprbpl sprbpl2 = null;
        try {
            sprbpl2 = new sprbpl(sprlvm.cfr_renamed_23(sprrzm2.cfr_renamed_24()));
        }
        catch (spritl spritl2) {
            throw new sprkfk(spritl2.getMessage(), spritl2.getCause());
        }
        sprug2 = sprbpl2.cfr_renamed_617();
        return new sprxgk(sprug2, -1L, null, arg0.cfr_renamed_9765());
    }

    private /* synthetic */ String cfr_renamed_9767(String arg0) {
        String string = arg0;
        while (string.endsWith("/") && arg0.length() > 0) {
            String string2 = arg0;
            string = string2.substring(0, string2.length() - 1);
        }
        String string3 = arg0;
        while (string3.startsWith("/") && arg0.length() > 0) {
            string3 = arg0.substring(1);
        }
        if (arg0.length() == 0) {
            throw new IllegalArgumentException(sprdfj.cfr_renamed_9("\u001f{1\u007f?: \u007f':1o':2|'\u007f!:'h:w>s=}s=|=ss :=u':)\u007f!usv6t4n;: n!s=}}"));
        }
        if (!cfr_renamed_86.matcher(arg0).matches()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("i(H;_?\u001a=[9Rm")).append(arg0).append(sprdfj.cfr_renamed_9(":0u=n2s=iss=l2v:~sy;{!{0n6h ")).toString());
        }
        if (cfr_renamed_91.contains(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("v,X(Vm")).append(arg0).append(sprdfj.cfr_renamed_9("::is{sh6i6h%\u007f7:#{'rsi6}>\u007f=n}")).toString());
        }
        return arg0;
    }

    public sprxgk cfr_renamed_9768(sprmqg arg0, sprix arg1) throws IOException {
        return this.cfr_renamed_9769(false, arg0, arg1, true);
    }

    public static sprtpl[] cfr_renamed_9770(sprug<sprtpl> arg0) {
        return sprpmk.cfr_renamed_9771(arg0, null);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvfk cfr_renamed_9772() throws sprkfk {
        Exception exception;
        Exception exception2;
        spryfk spryfk2;
        sprfpk sprfpk2;
        block18: {
            block17: {
                sprfpk sprfpk3;
                if (!this.cfr_renamed_1.cfr_renamed_9710()) {
                    throw new IllegalStateException(sprbjy.cfr_renamed_9("\u0003UmN?O>Nm[#Y%U?Ic"));
                }
                sprfpk2 = null;
                spryfk2 = null;
                exception2 = null;
                URL uRL = null;
                uRL = new URL(new StringBuilder().insert(0, this.cfr_renamed_152).append(cfr_renamed_3).toString());
                sprkt sprkt2 = this.cfr_renamed_1.cfr_renamed_9729();
                sprvnk sprvnk2 = new sprmnk("GET", uRL).cfr_renamed_9773(sprkt2).cfr_renamed_1451();
                sprfpk2 = sprkt2.cfr_renamed_9746(sprvnk2);
                switch (sprfpk2.cfr_renamed_9732()) {
                    case 200: {
                        try {
                            sprrzm sprrzm2 = this.cfr_renamed_9774(sprfpk2.cfr_renamed_2920(), sprfpk2.cfr_renamed_9775());
                            sprszm sprszm2 = sprszm.cfr_renamed_23(sprrzm2.cfr_renamed_24());
                            spryfk2 = new spryfk(sprltm.cfr_renamed_23(sprszm2));
                            sprfpk3 = sprfpk2;
                            break;
                        }
                        catch (Throwable throwable) {
                            throw new sprkfk(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("^6y<~:t4:\u0010[\u0010\u007f!n  s")).append(uRL.toString()).append(" ").append(throwable.getMessage()).toString(), throwable, sprfpk2.cfr_renamed_9732(), sprfpk2.cfr_renamed_2920());
                        }
                    }
                    case 204: {
                        spryfk2 = null;
                        sprfpk3 = sprfpk2;
                        break;
                    }
                    case 404: {
                        spryfk2 = null;
                        sprfpk3 = sprfpk2;
                        break;
                    }
                    default: {
                        throw new sprkfk(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("\u000ei\u001f\u001a\fN9H$X8N(\u001a?_<O(I9\u0000m")).append(sprvnk2.cfr_renamed_2627().toString()).toString(), null, sprfpk2.cfr_renamed_9732(), sprfpk2.cfr_renamed_2920());
                    }
                }
                if (sprfpk3 == null) break block17;
                try {
                    sprfpk2.cfr_renamed_2637();
                    exception = exception2;
                }
                catch (Exception exception3) {
                    exception = exception2 = exception3;
                }
                break block18;
                catch (Throwable throwable) {
                    try {
                        if (!(throwable instanceof sprkfk)) throw new sprkfk(throwable.getMessage(), throwable);
                        throw (sprkfk)throwable;
                    }
                    catch (Throwable throwable2) {
                        Throwable throwable3;
                        if (sprfpk2 != null) {
                            try {
                                sprfpk2.cfr_renamed_2637();
                                throwable3 = throwable2;
                                throw throwable3;
                            }
                            catch (Exception exception4) {
                                exception2 = exception4;
                            }
                        }
                        throwable3 = throwable2;
                        throw throwable3;
                    }
                }
            }
            exception = exception2;
        }
        if (exception == null) return new sprvfk(spryfk2, sprfpk2.cfr_renamed_9765());
        if (!(exception2 instanceof sprkfk)) throw new sprkfk(exception2.getMessage(), (Throwable)exception2, sprfpk2.cfr_renamed_9732(), null);
        throw (sprkfk)exception2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxgk cfr_renamed_9776(boolean arg0, sprjkg arg1, sprcf arg2, sprix arg3, boolean arg4) throws IOException {
        if (!this.cfr_renamed_1.cfr_renamed_9710()) {
            throw new IllegalStateException(sprdfj.cfr_renamed_9("\u001dusn!o ns{=y;u!i}"));
        }
        sprfpk sprfpk2 = null;
        try {
            URL uRL = new URL(new StringBuilder().insert(0, this.cfr_renamed_152).append(arg0 ? cfr_renamed_119 : cfr_renamed_4).toString());
            sprkt sprkt2 = this.cfr_renamed_1.cfr_renamed_9729();
            sprmnk sprmnk2 = new sprmnk(sprbjy.cfr_renamed_9("j\u0002i\u0019"), uRL).cfr_renamed_9773(sprkt2).cfr_renamed_9777(new sprpjk(this, arg1, arg2));
            if (arg3 != null) {
                arg3.cfr_renamed_9760(sprmnk2);
            }
            sprfpk2 = sprkt2.cfr_renamed_9746(sprmnk2.cfr_renamed_1451());
            sprxgk sprxgk2 = this.cfr_renamed_9764(sprfpk2);
            return sprxgk2;
        }
        catch (Throwable throwable) {
            if (!(throwable instanceof sprkfk)) throw new sprkfk(throwable.getMessage(), throwable);
            throw (sprkfk)throwable;
        }
        finally {
            if (sprfpk2 != null) {
                sprfpk2.cfr_renamed_2637();
            }
        }
    }

    private /* synthetic */ sprrzm cfr_renamed_9774(InputStream arg0, Long arg1) {
        if (arg1 == null) {
            return new sprrzm(arg0);
        }
        if ((long)arg1.intValue() == arg1) {
            return new sprrzm(arg0, arg1.intValue());
        }
        return new sprrzm(arg0);
    }

    public sprxgk cfr_renamed_9778(boolean arg0, sprmqg arg1, sprix arg2) throws IOException {
        return this.cfr_renamed_9769(arg0, arg1, arg2, false);
    }

    public sprxgk cfr_renamed_9779(boolean arg0, sprjkg arg1, sprcf arg2, sprix arg3) throws IOException {
        return this.cfr_renamed_9776(arg0, arg1, arg2, arg3, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxgk cfr_renamed_9780(sprxgk arg0) throws Exception {
        if (!this.cfr_renamed_1.cfr_renamed_9710()) {
            throw new IllegalStateException(sprdfj.cfr_renamed_9("\u001dusn!o ns{=y;u!i}"));
        }
        sprfpk sprfpk2 = null;
        try {
            sprkt sprkt2;
            sprpmk sprpmk2 = this;
            sprkt sprkt3 = sprkt2 = sprpmk2.cfr_renamed_1.cfr_renamed_9729();
            sprkt sprkt4 = sprkt2;
            sprfpk2 = sprkt4.cfr_renamed_9746(new sprmnk(arg0.cfr_renamed_9781()).cfr_renamed_9773(sprkt4).cfr_renamed_1451());
            sprxgk sprxgk2 = sprpmk2.cfr_renamed_9764(sprfpk2);
            return sprxgk2;
        }
        catch (Throwable throwable) {
            if (!(throwable instanceof sprkfk)) throw new sprkfk(throwable.getMessage(), throwable);
            throw (sprkfk)throwable;
        }
        finally {
            if (sprfpk2 != null) {
                sprfpk2.cfr_renamed_2637();
            }
        }
    }

    private /* synthetic */ String cfr_renamed_9782(String arg0) {
        block6: {
            try {
                String string = arg0;
                while (string.endsWith("/") && arg0.length() > 0) {
                    String string2 = arg0;
                    string = string2.substring(0, string2.length() - 1);
                }
                if (arg0.contains("://")) {
                    throw new IllegalArgumentException(sprbjy.cfr_renamed_9("i(H;_?\u001a.U#N,S#ImI.R(W(\u0016mW8I9\u001a\"T!CmX(\u001aq^#I#[ _bS=[)^?_>Is\u0000=U?Na\u001a%N9J>\u0000b\u0015mM$V!\u001a/_m[)^(^m[?X$N?[?S!Cc"));
                }
                URL uRL = new URL(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("r'n#ii5|")).append(arg0).toString());
                if (uRL.getPath().length() != 0 && !uRL.getPath().equals("/")) break block6;
                return arg0;
            }
            catch (Exception exception) {
                if (exception instanceof IllegalArgumentException) {
                    throw (IllegalArgumentException)exception;
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("I0r6w6:2t7:;u nss ::t%{?s7 s")).append(exception.getMessage()).toString(), exception);
            }
        }
        throw new IllegalArgumentException(sprbjy.cfr_renamed_9("i(H;_?\u001a.U#N,S#ImJ,N%\u0016mW8I9\u001a\"T!CmX(\u001aq^#I#[ _bS=[)^?_>Is\u0000=U?Na\u001a,\u001a=[9RmU+\u001aj\u0015cM(V!\u0017&T\"M#\u0015(I9\u0015qV,X(Vs\u001dmM$V!\u001a/_m[)^(^m[?X$N?[?S!Cc"));
    }

    public static sprtpl[] cfr_renamed_9771(sprug<sprtpl> arg0, sprhd<sprtpl> arg1) {
        Collection<sprtpl> collection = arg0.cfr_renamed_3216(arg1);
        return collection.toArray(new sprtpl[collection.size()]);
    }

    public sprxgk cfr_renamed_9783(sprjkg arg0, sprcf arg1, sprix arg2) throws IOException {
        return this.cfr_renamed_9776(false, arg0, arg1, arg2, true);
    }

    public static /* synthetic */ String cfr_renamed_9784(sprpmk arg0, byte[] arg1) {
        return arg0.cfr_renamed_9785(arg1);
    }

    static {
        cfr_renamed_91 = new HashSet<String>();
        cfr_renamed_91.add(cfr_renamed_2.substring(1));
        cfr_renamed_91.add(cfr_renamed_4.substring(1));
        cfr_renamed_91.add(cfr_renamed_119.substring(1));
        cfr_renamed_91.add(cfr_renamed_0.substring(1));
        cfr_renamed_91.add(cfr_renamed_112.substring(1));
        cfr_renamed_91.add(cfr_renamed_3.substring(1));
        cfr_renamed_86 = Pattern.compile(sprbjy.cfr_renamed_9("d\u0016\n`\u0003,\u00177{``\u0012f`\u00143\u001bi\u001cj\u0012d\u0010f\u0016v\u0000pgf"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnlk cfr_renamed_9786() throws sprkfk {
        Exception exception;
        URL uRL;
        sprnlk sprnlk2;
        Exception exception2;
        sprfpk sprfpk2;
        block16: {
            block15: {
                sprfpk2 = null;
                exception2 = null;
                sprnlk2 = null;
                uRL = null;
                boolean bl = false;
                try {
                    uRL = new URL(new StringBuilder().insert(0, this.cfr_renamed_152).append(cfr_renamed_2).toString());
                    sprkt sprkt2 = this.cfr_renamed_1.cfr_renamed_9729();
                    sprvnk sprvnk2 = new sprmnk("GET", uRL).cfr_renamed_9773(sprkt2).cfr_renamed_1451();
                    sprfpk2 = sprkt2.cfr_renamed_9746(sprvnk2);
                    sprug<sprtpl> sprug2 = null;
                    sprug<sprpxl> sprug3 = null;
                    if (sprfpk2.cfr_renamed_9732() == 200) {
                        String string = sprfpk2.cfr_renamed_479().cfr_renamed_9787("Content-Type");
                        if (string == null || !string.startsWith(sprdfj.cfr_renamed_9("{#j?s0{'s<t|j8y -~w:w6"))) {
                            String string2 = string != null ? new StringBuilder().insert(0, sprbjy.cfr_renamed_9("m]\"Nm")).append(string).toString() : sprdfj.cfr_renamed_9("sx&nsm2ist<nsj!\u007f \u007f=n}");
                            throw new sprkfk(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("\u001f_>J\"T>_m\u0000m")).append(uRL.toString()).append(sprdfj.cfr_renamed_9("\u0016b#\u007f0n:t4:2j#v:y2n:u=5#q0id7>s>\u007fs")).append(string2).toString(), null, sprfpk2.cfr_renamed_9732(), sprfpk2.cfr_renamed_2920());
                        }
                        try {
                            sprrzm sprrzm2 = this.cfr_renamed_9774(sprfpk2.cfr_renamed_2920(), sprfpk2.cfr_renamed_9775());
                            sprbpl sprbpl2 = new sprbpl(sprlvm.cfr_renamed_23(sprrzm2.cfr_renamed_24()));
                            sprug2 = sprbpl2.cfr_renamed_617();
                            sprug3 = sprbpl2.cfr_renamed_633();
                        }
                        catch (Throwable throwable) {
                            throw new sprkfk(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("~(Y\"^$T*\u001a\u000e{\u000e_?N>\u0000m")).append(uRL.toString()).append(" ").append(throwable.getMessage()).toString(), throwable, sprfpk2.cfr_renamed_9732(), sprfpk2.cfr_renamed_2920());
                        }
                    } else if (sprfpk2.cfr_renamed_9732() != 204) {
                        throw new sprkfk(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("\u0014\u007f':\u0010[\u0010\u007f!n  s")).append(uRL.toString()).toString(), null, sprfpk2.cfr_renamed_9732(), sprfpk2.cfr_renamed_2920());
                    }
                    sprnlk2 = new sprnlk(sprug2, sprug3, sprvnk2, sprfpk2.cfr_renamed_9765(), this.cfr_renamed_1.cfr_renamed_9710());
                    if (sprfpk2 == null) break block15;
                }
                catch (Throwable throwable) {
                    try {
                        bl = true;
                        if (!(throwable instanceof sprkfk)) throw new sprkfk(throwable.getMessage(), throwable);
                        throw (sprkfk)throwable;
                    }
                    catch (Throwable throwable2) {
                        Throwable throwable3;
                        if (sprfpk2 != null) {
                            try {
                                sprfpk2.cfr_renamed_2637();
                                throwable3 = throwable2;
                                throw throwable3;
                            }
                            catch (Exception exception3) {
                                exception2 = exception3;
                            }
                        }
                        throwable3 = throwable2;
                        throw throwable3;
                    }
                }
                try {
                    sprfpk2.cfr_renamed_2637();
                    exception = exception2;
                }
                catch (Exception exception4) {
                    exception = exception2 = exception4;
                }
                break block16;
            }
            exception = exception2;
        }
        if (exception == null) return sprnlk2;
        if (!(exception2 instanceof sprkfk)) throw new sprkfk(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("\n_9\u001a\u000e{\u000e_?N>\u0000m")).append(uRL.toString()).toString(), (Throwable)exception2, sprfpk2.cfr_renamed_9732(), null);
        throw (sprkfk)exception2;
    }

    private /* synthetic */ String cfr_renamed_9785(byte[] arg0) {
        int n = 0;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        do {
            PrintWriter printWriter2;
            if (n + 48 < arg0.length) {
                PrintWriter printWriter3 = printWriter;
                printWriter2 = printWriter3;
                int n2 = n;
                n += 48;
                printWriter3.print(sprtue.cfr_renamed_509(arg0, n2, 48));
            } else {
                printWriter.print(sprtue.cfr_renamed_509(arg0, n, arg0.length - n));
                n = arg0.length;
                printWriter2 = printWriter;
            }
            printWriter2.print('\n');
        } while (n < arg0.length);
        printWriter.flush();
        return stringWriter.toString();
    }

    public sprxgk cfr_renamed_9769(boolean arg0, sprmqg arg1, sprix arg2, boolean arg3) throws IOException {
        if (!this.cfr_renamed_1.cfr_renamed_9710()) {
            throw new IllegalStateException(sprdfj.cfr_renamed_9("\u001dusn!o ns{=y;u!i}"));
        }
        sprfpk sprfpk2 = null;
        try {
            sprmnk sprmnk2;
            byte[] byArray = this.cfr_renamed_9785(arg1.cfr_renamed_91()).getBytes();
            URL uRL = new URL(new StringBuilder().insert(0, this.cfr_renamed_152).append(arg3 ? cfr_renamed_112 : (arg0 ? cfr_renamed_119 : cfr_renamed_4)).toString());
            sprkt sprkt2 = this.cfr_renamed_1.cfr_renamed_9729();
            sprmnk sprmnk3 = sprmnk2 = new sprmnk(sprbjy.cfr_renamed_9("j\u0002i\u0019"), uRL).cfr_renamed_9788(byArray).cfr_renamed_9773(sprkt2);
            sprmnk3.cfr_renamed_9740("Content-Type", sprdfj.cfr_renamed_9("{#j?s0{'s<t|j8y +c"));
            sprmnk3.cfr_renamed_9740(sprbjy.cfr_renamed_9("y\"T9_#N`v(T*N%"), new StringBuilder().insert(0, "").append(byArray.length).toString());
            sprmnk2.cfr_renamed_9740("Content-Transfer-Encoding", "base64");
            if (arg2 != null) {
                arg2.cfr_renamed_9760(sprmnk2);
            }
            sprfpk2 = sprkt2.cfr_renamed_9746(sprmnk2.cfr_renamed_1451());
            sprxgk sprxgk2 = this.cfr_renamed_9764(sprfpk2);
            return sprxgk2;
        }
        catch (Throwable throwable) {
            if (throwable instanceof sprkfk) {
                throw (sprkfk)throwable;
            }
            throw new sprkfk(throwable.getMessage(), throwable);
        }
        finally {
            if (sprfpk2 != null) {
                sprfpk2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprpmk(String string, String string2, sprox sprox2) {
        void arg2;
        sprpmk sprpmk2;
        String arg1;
        sprpmk sprpmk3 = this;
        String arg0 = sprpmk3.cfr_renamed_9782(string);
        if (arg1 != null) {
            arg1 = this.cfr_renamed_9767(arg1);
            sprpmk2 = this;
            this.cfr_renamed_152 = sprdfj.cfr_renamed_9("r'n#ii5|") + arg0 + sprbjy.cfr_renamed_9("b\u0014:_!V`Q#U:Tb_>Nb") + arg1;
        } else {
            sprpmk2 = this;
            this.cfr_renamed_152 = new StringBuilder().insert(0, sprdfj.cfr_renamed_9("r'n#ii5|")).append(arg0).append(sprbjy.cfr_renamed_9("\u0015cM(V!\u0017&T\"M#\u0015(I9")).toString();
        }
        sprpmk2.cfr_renamed_1 = arg2;
    }
}

