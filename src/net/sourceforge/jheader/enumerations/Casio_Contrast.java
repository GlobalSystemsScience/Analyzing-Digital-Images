
/*
JHeader, a Java library and tools for reading and editing EXIF headers.
Copyright (C) 2005 Matthew Baker

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

For further information, please contact Matthew Baker on msb@safe-mail.net.
Project home page: www.sourceforge.net/jheader
*/
package net.sourceforge.jheader.enumerations;
import net.sourceforge.jheader.*;

import java.util.*;

public class Casio_Contrast extends EnumeratedTag
{
    public static final long NORMAL = 0;
    public static final long LOW = 1;
    public static final long HIGH = 2;
    
    static private Object[] data = new Object[] {
	NORMAL, "Normal",
	LOW, "Low",
	HIGH, "High"
    };

    static
    {
	populate(Casio_Contrast.class, data);
    }

    
    public Casio_Contrast(Long value) {super(value);}
    public Casio_Contrast(String value) throws TagFormatException {super(value);}
}
