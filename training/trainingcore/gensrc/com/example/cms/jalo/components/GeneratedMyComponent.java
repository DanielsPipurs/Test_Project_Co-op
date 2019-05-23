/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 20, 2019 4:53:25 PM                     ---
 * ----------------------------------------------------------------
 */
package com.example.cms.jalo.components;

import com.stackextend.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.example.cms.jalo.components.MyComponent MyComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>MyComponent.myProperty</code> attribute **/
	public static final String MYPROPERTY = "myProperty";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MYPROPERTY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyComponent.myProperty</code> attribute.
	 * @return the myProperty - It is my localized property.
	 */
	public String getMyProperty(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMyComponent.getMyProperty requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MYPROPERTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyComponent.myProperty</code> attribute.
	 * @return the myProperty - It is my localized property.
	 */
	public String getMyProperty()
	{
		return getMyProperty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyComponent.myProperty</code> attribute. 
	 * @return the localized myProperty - It is my localized property.
	 */
	public Map<Language,String> getAllMyProperty(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MYPROPERTY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyComponent.myProperty</code> attribute. 
	 * @return the localized myProperty - It is my localized property.
	 */
	public Map<Language,String> getAllMyProperty()
	{
		return getAllMyProperty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyComponent.myProperty</code> attribute. 
	 * @param value the myProperty - It is my localized property.
	 */
	public void setMyProperty(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMyComponent.setMyProperty requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MYPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyComponent.myProperty</code> attribute. 
	 * @param value the myProperty - It is my localized property.
	 */
	public void setMyProperty(final String value)
	{
		setMyProperty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyComponent.myProperty</code> attribute. 
	 * @param value the myProperty - It is my localized property.
	 */
	public void setAllMyProperty(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MYPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyComponent.myProperty</code> attribute. 
	 * @param value the myProperty - It is my localized property.
	 */
	public void setAllMyProperty(final Map<Language,String> value)
	{
		setAllMyProperty( getSession().getSessionContext(), value );
	}
	
}
