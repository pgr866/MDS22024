import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-seccioncomentarios')
export class VistaSeccioncomentarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between;" id="Layoutseccioncomentarios">
 <label style="flex-shrink: 0; align-self: center; font-size: 150%; align-self: center;">Comentarios</label>
 <vaadin-horizontal-layout style="flex-shrink: 0; flex-grow: 0; height: 15%; width: 100%; justify-content: space-between; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; height: 100%; width: 12%; align-self: center;">
    Añadir comentario 
  </vaadin-button>
  <vaadin-text-area placeholder="Escriba un comentario..." style="width: 85%; height: 100%;"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 0; width: 100%; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-s); padding-bottom: var(--lumo-space-s); padding-left: var(--lumo-space-s); padding: var(--lumo-space-s);" id="Seccioncomentarios"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
