package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;

import java.io.IOException;

/**
 * Basic interface to create boxes from a <code>IsoBufferWrapper</code> and its parent.
 */
public interface BoxParser {
    Box parseBox(IsoBufferWrapper in, Box parent, Box lastMovieFragmentBox) throws IOException;
}
