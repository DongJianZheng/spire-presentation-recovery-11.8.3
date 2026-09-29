/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbx;
import com.spire.presentation.packages.sprfpk;
import com.spire.presentation.packages.sprhp;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprkfk;
import com.spire.presentation.packages.sprkt;
import com.spire.presentation.packages.sprkyp;
import com.spire.presentation.packages.sprmnk;
import com.spire.presentation.packages.spruaz;
import com.spire.presentation.packages.sprujk;
import com.spire.presentation.packages.sprvnk;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class sprdkk
implements sprkt {
    private final sprbx cfr_renamed_2;
    private static final Charset cfr_renamed_3 = Charset.forName("UTF-8");
    private static byte[] cfr_renamed_4;

    static {
        byte[] byArray = new byte[2];
        byArray[0] = 13;
        byArray[1] = 10;
        cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprvnk cfr_renamed_9731(sprfpk arg0) throws IOException {
        sprvnk sprvnk2;
        sprvnk sprvnk3;
        block7: {
            block8: {
                sprvnk3 = null;
                if (arg0.cfr_renamed_9732() < 300 || arg0.cfr_renamed_9732() > 399) break block8;
                switch (arg0.cfr_renamed_9732()) {
                    case 301: 
                    case 302: 
                    case 303: 
                    case 306: 
                    case 307: {
                        String string = arg0.cfr_renamed_9733(spruaz.cfr_renamed_9("=@\u0012N\u0005F\u001eA"));
                        if ("".equals(string)) {
                            throw new sprkfk(new StringBuilder().insert(0, sprkyp.cfr_renamed_9("&\u0013\u0010\u001f\u0006\u0013\u0017\u0002T\u0005\u0000\u0017\u0000\u0003\u0007V\u0000\u000f\u0004\u0013NV")).append(arg0.cfr_renamed_9732()).append(spruaz.cfr_renamed_9("\u000f\u0013Z\u0005\u000f\u001f@QC\u001eL\u0010[\u0018@\u001f\u000f\u0019J\u0010K\u0014]")).toString());
                        }
                        sprmnk sprmnk2 = new sprmnk(arg0.cfr_renamed_9734());
                        if (string.startsWith("http")) {
                            sprvnk2 = sprvnk3 = sprmnk2.cfr_renamed_9735(new URL(string)).cfr_renamed_1451();
                            break block7;
                        } else {
                            URL uRL = arg0.cfr_renamed_9734().cfr_renamed_2627();
                            sprvnk2 = sprvnk3 = sprmnk2.cfr_renamed_9735(new URL(uRL.getProtocol(), uRL.getHost(), uRL.getPort(), string)).cfr_renamed_1451();
                        }
                        break block7;
                    }
                    default: {
                        throw new sprkfk(new StringBuilder().insert(0, sprkyp.cfr_renamed_9("5\u0018\u001f\u0011\u0018\u0000V\u0010\u0019\u0011\u0005T\u0018\u001b\u0002T\u001e\u0015\u0018\u0010\u001a\u0011V\u001c\u0002\u0000\u0006T\u0005\u0000\u0017\u0000\u0003\u0007V\u0017\u0019\u0010\u0013NV")).append(arg0.cfr_renamed_9732()).toString());
                    }
                }
            }
            sprvnk2 = sprvnk3;
        }
        if (sprvnk2 != null) {
            arg0.cfr_renamed_2637();
        }
        return sprvnk3;
    }

    public sprdkk(sprbx sprbx2) {
        this.cfr_renamed_2 = sprbx2;
    }

    private static /* synthetic */ void cfr_renamed_9736(OutputStream arg0, String arg1) throws IOException {
        OutputStream outputStream = arg0;
        outputStream.write(arg1.getBytes());
        outputStream.write(cfr_renamed_4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public sprfpk cfr_renamed_9737(sprvnk arg0) throws IOException {
        sprfpk sprfpk2 = null;
        sprhp sprhp2 = null;
        try {
            Object object;
            sprmnk sprmnk2;
            URL uRL;
            sprhp2 = this.cfr_renamed_2.cfr_renamed_9730(arg0.cfr_renamed_2627().getHost(), arg0.cfr_renamed_2627().getPort());
            if (arg0.cfr_renamed_9738() != null) {
                arg0 = arg0.cfr_renamed_9738().cfr_renamed_9739(sprhp2, arg0);
            }
            OutputStream outputStream = null;
            Set<String> set = sprjcf.cfr_renamed_5160(spruaz.cfr_renamed_9("\u0012@\u001c\u0001\u0002_\u0018]\u0014\u0001\u0001\\\u001c@\u0015J\u001d\u0001\u0002J\u0012Z\u0003F\u0005V_K\u0014M\u0004H_J\u0002["));
            outputStream = set.contains(sprkyp.cfr_renamed_9("\u001b\u0003\u0000\u0006\u0001\u0002")) || set.contains("all") ? new sprujk(sprhp2.cfr_renamed_470()) : sprhp2.cfr_renamed_470();
            String string = new StringBuilder().insert(0, arg0.cfr_renamed_2627().getPath()).append(arg0.cfr_renamed_2627().getQuery() != null ? arg0.cfr_renamed_2627().getQuery() : "").toString();
            sprmnk sprmnk3 = new sprmnk(arg0);
            if (!arg0.cfr_renamed_479().containsKey(spruaz.cfr_renamed_9("2@\u001fA\u0014L\u0005F\u001eA"))) {
                sprmnk3.cfr_renamed_9740(sprkyp.cfr_renamed_9("7\u0019\u001a\u0018\u0011\u0015\u0000\u001f\u001b\u0018"), "close");
            }
            if ((uRL = arg0.cfr_renamed_2627()).getPort() > -1) {
                Object[] objectArray = new Object[2];
                objectArray[0] = uRL.getHost();
                objectArray[1] = uRL.getPort();
                sprmnk3.cfr_renamed_9741(spruaz.cfr_renamed_9("9@\u0002["), String.format(sprkyp.cfr_renamed_9("S\u0007LQ\u0012"), objectArray));
                sprmnk2 = sprmnk3;
            } else {
                sprmnk sprmnk4 = sprmnk3;
                sprmnk2 = sprmnk4;
                sprmnk4.cfr_renamed_9741(spruaz.cfr_renamed_9("9@\u0002["), uRL.getHost());
            }
            sprvnk sprvnk2 = sprmnk2.cfr_renamed_1451();
            sprvnk sprvnk3 = sprvnk2;
            sprdkk.cfr_renamed_9736(outputStream, sprvnk3.cfr_renamed_9742() + " " + string + sprkyp.cfr_renamed_9("V<\" &[GZG"));
            for (Map.Entry<String, String[]> entry : sprvnk3.cfr_renamed_479().entrySet()) {
                int n;
                String[] stringArray = entry.getValue();
                int n2 = n = 0;
                while (n2 != stringArray.length) {
                    String string2 = stringArray[n];
                    sprdkk.cfr_renamed_9736(outputStream, entry.getKey() + ": " + string2);
                    n2 = ++n;
                }
            }
            OutputStream outputStream2 = outputStream;
            outputStream2.write(cfr_renamed_4);
            outputStream2.flush();
            sprvnk2.cfr_renamed_9743(outputStream2);
            outputStream.flush();
            if (sprvnk2.cfr_renamed_9744() != null) {
                sprfpk2 = sprvnk2.cfr_renamed_9744().cfr_renamed_9745(sprvnk2, sprhp2);
                object = sprfpk2;
                return object;
            }
            sprfpk2 = new sprfpk(sprvnk2, sprhp2);
            object = sprfpk2;
            return object;
        }
        finally {
            if (sprhp2 != null && sprfpk2 == null) {
                sprhp2.cfr_renamed_2637();
            }
        }
    }

    @Override
    public sprfpk cfr_renamed_9746(sprvnk arg0) throws IOException {
        sprdkk sprdkk2;
        sprfpk sprfpk2 = null;
        sprvnk sprvnk2 = arg0;
        int n = 15;
        do {
            sprdkk2 = this;
        } while ((sprvnk2 = sprdkk2.cfr_renamed_9731(sprfpk2 = sprdkk2.cfr_renamed_9737(sprvnk2))) != null && --n > 0);
        if (n == 0) {
            throw new sprkfk(spruaz.cfr_renamed_9("%@\u001e\u000f\u001cN\u001fVQ]\u0014K\u0018]\u0014L\u0005\\_\u0001"));
        }
        return sprfpk2;
    }
}

