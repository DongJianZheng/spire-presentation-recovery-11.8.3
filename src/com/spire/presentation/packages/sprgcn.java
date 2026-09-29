/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprkn;
import com.spire.presentation.packages.sprmfn;
import com.spire.presentation.packages.sprose;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.InputStream;

public class sprgcn
implements sprkn {
    private final sprmfn cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_106() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sprgbf.cfr_renamed_11295(this.cfr_renamed_3.cfr_renamed_954());
    }

    private /* synthetic */ InputStream cfr_renamed_11296(boolean arg0) throws IOException {
        int n = this.cfr_renamed_3.cfr_renamed_4583();
        if (n < 1) {
            throw new IllegalStateException(sprqyo.cfr_renamed_9("\t7\u0004,\u000f6\u001ex\u0005;\u001e=\u001e+J;\u000b6\u00047\u001ex\b=J=\u0007(\u001e!"));
        }
        sprgcn sprgcn2 = this;
        sprgcn2.cfr_renamed_4 = sprgcn2.cfr_renamed_3.read();
        if (sprgcn2.cfr_renamed_4 > 0) {
            if (n < 2) {
                throw new IllegalStateException(sprose.cfr_renamed_9("7l?fme(g*}%))h9hm~$}%)#f#$7l?fmy,mmk$}>"));
            }
            if (this.cfr_renamed_4 > 7) {
                throw new IllegalStateException(sprqyo.cfr_renamed_9("\u001a9\u000ex\b1\u001e+J;\u000b6\u00047\u001ex\b=J?\u0018=\u000b,\u000f*J,\u00029\u0004x]x\u0005*J4\u000f+\u0019x\u001e0\u000b6Jh"));
            }
            if (arg0) {
                throw new IOException(new StringBuilder().insert(0, sprose.cfr_renamed_9("(q=l.}(mmf.}(}`h!`*g(mmk$}>}?`#na)/|9)+f8g))=h)K$}>3m")).append(this.cfr_renamed_4).toString());
            }
        }
        return this.cfr_renamed_3;
    }

    @Override
    public InputStream cfr_renamed_3231() throws IOException {
        return this.cfr_renamed_11296(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprqyo.cfr_renamed_9("\u0011%\u001d\u0012;\u000f(\u001e1\u00056J;\u00056\u001c=\u0018,\u00036\rx\u0019,\u0018=\u000b5J,\u0005x\b!\u001e=J9\u0018*\u000b!Px")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprgcn(sprmfn sprmfn2) {
        sprgcn sprgcn2 = this;
        sprgcn2.cfr_renamed_4 = 0;
        sprgcn2.cfr_renamed_3 = sprmfn2;
    }

    @Override
    public InputStream cfr_renamed_698() throws IOException {
        return this.cfr_renamed_11296(true);
    }
}

