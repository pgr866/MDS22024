import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="Layoutseccioncomentarios">
 <label style="flex-shrink: 0; font-size: 120%; width: 100%; align-self: center; font-size: 100%; text-align: center;" id="Labelmensajenohaycomentarios">Aún no hay comentarios.</label>
 <vaadin-vertical-layout style="flex-grow: 0; flex-shrink: 0; width: 100%; padding: 0; align-items: center; padding-bottom: var(--lumo-space-xl);" id="Layoutvistaseccioncomentarios"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
