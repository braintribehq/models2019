/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMapConversion of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link Eastings}, 
{@link EastingsAsString}, 
{@link Northings}, 
{@link NorthingsAsString}, 
{@link OrthogonalHeight}, 
{@link OrthogonalHeightAsString}, 
{@link XAxisAbscissa}, 
{@link XAxisAbscissaAsString}, 
{@link XAxisOrdinate}, 
{@link XAxisOrdinateAsString}, 
{@link Scale}, 
{@link ScaleAsString}, 

* It provides of then following operations (getters and setters)
{@link getEastings},
{@link getEastingsAsString},
{@link getNorthings},
{@link getNorthingsAsString},
{@link getOrthogonalHeight},
{@link getOrthogonalHeightAsString},
{@link getXAxisAbscissa},
{@link getXAxisAbscissaAsString},
{@link getXAxisOrdinate},
{@link getXAxisOrdinateAsString},
{@link getScale},
{@link getScaleAsString},
{@link setEastings},
{@link setEastingsAsString},
{@link setNorthings},
{@link setNorthingsAsString},
{@link setOrthogonalHeight},
{@link setOrthogonalHeightAsString},
{@link setXAxisAbscissa},
{@link setXAxisAbscissaAsString},
{@link setXAxisOrdinate},
{@link setXAxisOrdinateAsString},
{@link setScale},
{@link setScaleAsString},
 */

@Description("")

public interface IfcMapConversion extends GenericEntity, ifc4.IfcCoordinateOperation {

	EntityType<IfcMapConversion> T = EntityTypes.T(IfcMapConversion.class);

	/* Constants for each property name. */
	java.lang.String Eastings = "Eastings";
	java.lang.String EastingsAsString = "EastingsAsString";
	java.lang.String Northings = "Northings";
	java.lang.String NorthingsAsString = "NorthingsAsString";
	java.lang.String OrthogonalHeight = "OrthogonalHeight";
	java.lang.String OrthogonalHeightAsString = "OrthogonalHeightAsString";
	java.lang.String XAxisAbscissa = "XAxisAbscissa";
	java.lang.String XAxisAbscissaAsString = "XAxisAbscissaAsString";
	java.lang.String XAxisOrdinate = "XAxisOrdinate";
	java.lang.String XAxisOrdinateAsString = "XAxisOrdinateAsString";
	java.lang.String Scale = "Scale";
	java.lang.String ScaleAsString = "ScaleAsString";

	@Description("")
	@Mandatory
	java.lang.Double getEastings();
	void setEastings(java.lang.Double Eastings);
	@Description("")
	@Mandatory
	java.lang.String getEastingsAsString();
	void setEastingsAsString(java.lang.String EastingsAsString);
	@Description("")
	@Mandatory
	java.lang.Double getNorthings();
	void setNorthings(java.lang.Double Northings);
	@Description("")
	@Mandatory
	java.lang.String getNorthingsAsString();
	void setNorthingsAsString(java.lang.String NorthingsAsString);
	@Description("")
	@Mandatory
	java.lang.Double getOrthogonalHeight();
	void setOrthogonalHeight(java.lang.Double OrthogonalHeight);
	@Description("")
	@Mandatory
	java.lang.String getOrthogonalHeightAsString();
	void setOrthogonalHeightAsString(java.lang.String OrthogonalHeightAsString);
	@Description("")
	@Mandatory
	java.lang.Double getXAxisAbscissa();
	void setXAxisAbscissa(java.lang.Double XAxisAbscissa);
	@Description("")
	@Mandatory
	java.lang.String getXAxisAbscissaAsString();
	void setXAxisAbscissaAsString(java.lang.String XAxisAbscissaAsString);
	@Description("")
	@Mandatory
	java.lang.Double getXAxisOrdinate();
	void setXAxisOrdinate(java.lang.Double XAxisOrdinate);
	@Description("")
	@Mandatory
	java.lang.String getXAxisOrdinateAsString();
	void setXAxisOrdinateAsString(java.lang.String XAxisOrdinateAsString);
	@Description("")
	@Mandatory
	java.lang.Double getScale();
	void setScale(java.lang.Double Scale);
	@Description("")
	@Mandatory
	java.lang.String getScaleAsString();
	void setScaleAsString(java.lang.String ScaleAsString);
}
