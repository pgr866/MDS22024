import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-secciones';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-noticiasenseccionusuarionoregistrado';
import './vista-noticiasenseccionidentificado';

@customElement('vista-explorarsecciones')
export class VistaExplorarsecciones extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0; align-items: center;">
 <vista-secciones style="flex-shrink: 0; width: 60%; height: 10%;"></vista-secciones>
 <vaadin-horizontal-layout style="width: 60%; justify-content: space-between; flex-shrink: 0; align-items: center;">
  <vaadin-text-field placeholder="Nombre sección" style="flex-shrink: 0; width: 45%;"></vaadin-text-field>
  <vaadin-button style="width: 25%; flex-shrink: 0;">
    Añadir sección 
  </vaadin-button>
  <vaadin-button style="width: 25%; flex-shrink: 0;">
    Eliminar sección 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; flex-grow: 1; justify-content: space-between;">
  <vista-noticiasenseccionidentificado style="flex-shrink: 0; width: 100%; padding-top: var(--lumo-space-s);"></vista-noticiasenseccionidentificado>
  <vista-noticiasenseccionusuarionoregistrado style="width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s);"></vista-noticiasenseccionusuarionoregistrado>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
